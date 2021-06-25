package javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

// Esperar ter um sistema operacional Linux ou um note melhor que suporte uma maquina virtual
public class PossixFileAtrtibutesTest {
    public static void main(String[] args)  throws IOException {
        Path path = Paths.get("/home/caio/dev/arquivo");
        PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());
        System.out.println("Alterando as permissoes");
//        PosixFileAttributeView view = Files.getFileAttributeView(path, PosixFileAttributeView.class);
//        view.setPermissions();
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
        Files.setPosixFilePermissions(path, permissions);
        System.out.println(posix.permissions());
    }
}
