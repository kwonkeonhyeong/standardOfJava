package exceptionHandling;

public class ExceptionEx12 {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException2 e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException2 {
        try {
            startInstall2();
            copyFiles2();
        } catch (SpaceException2 se2) {
            InstallException2 ie2 = new InstallException2("설치 중 예외발생");
            ie2.initCause(se2);
            throw ie2;
        } catch (MemoryException2 me2) {
            InstallException2 ie2 = new InstallException2("설치 중 예외발생");
            ie2.initCause(me2);
            throw ie2;
        } finally {
            deleteTempFiles2();
        }
    }

    static void startInstall2() throws SpaceException2, MemoryException2 {
        if(!enoughSpace2()) {
            throw new SpaceException2("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory2()) {
            throw new MemoryException2("메모리가 부족합니다.");
        }

    }
    static void copyFiles2() {
        /* 파일들을 복사하는 코드를 적는다. */
    }

    static void deleteTempFiles2() {
        /* 임시파일들을 삭제하는 코드를 적는다. */
    }

    static boolean enoughSpace2() {
        // 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
        return false;
    }

    static boolean enoughMemory2() {
        // 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
        return true;
    }

}


class InstallException2 extends Exception {
    InstallException2(String msg) {
        super(msg);
    }
}

class SpaceException2 extends Exception {
    SpaceException2(String msg) {
        super(msg);
    }
}

class MemoryException2 extends Exception {
    MemoryException2(String msg) {
        super(msg);
    }
}