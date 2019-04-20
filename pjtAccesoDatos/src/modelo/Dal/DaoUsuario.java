package modelo.Dal;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
import modelo.Dominio.HibernateUtil;
import modelo.Entidades.Usr;
import org.hibernate.Session;

public class DaoUsuario {

    public List<Usr> consultar() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        return sesion.createQuery("from Usr").list();
    }

    public Usr login(String user, String clave) {
        List<Usr> lst = this.consultar();
        boolean encontrado = false;
        int contr = 0;
        for (Usr usuario : lst) {
        if (usuario.getLogin().equals(user) && usuario.getClave().equals(toMD5(clave))) {
            return usuario;
            }
        }
        return null;
    }

    private String toMD5(String psw) {
        String md5 = null;
        try {
            MessageDigest mdEnc = MessageDigest.getInstance("MD5"); // Encryption algorithm
            mdEnc.update(psw.getBytes(), 0, psw.length());
            md5 = new BigInteger(1, mdEnc.digest()).toString(16); // Encrypted string
        } catch (Exception ex) {
            return null;
        }
        return md5;
    }
}

