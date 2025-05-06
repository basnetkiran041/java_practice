public class multiLevel {
    public static void main(String[] args) {
        classC cee = new classC();
        cee.MethodAi();
        cee.MethodBi();
        cee.MethodCi();
    }

}

class classA {
    void MethodAi() {
        System.out.println("This is Method A");
    }
}

class classB extends classA {
    void MethodBi() {
        System.out.println("This is method B");
    }
}

class classC extends classB {
    void MethodCi() {
        System.out.println("This is method C");

    }
}