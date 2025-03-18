//interface ka question hai make a interface of smartphone and call from the class
package Day32;
interface Camera{
    void click();
    static void glitch(){
        System.out.println("I am glitch effect");
    };
    default void snap(){
        System.out.println("I am on the snap");
    };
}

interface Phone{
    void call();

    default void Emergency(){
        System.out.println("Emergency call in case of emergency");
    }
}



class Smartphone implements Camera, Phone{
    public void click(){
        System.out.println("Hello, I am Camera App");
    }
    static void glitch(){
        System.out.println("I am fast glitch effect");
    }
    public void call(){
        System.out.println("Call me, Buddy");
    }
}

class interfacelambda{
    public static void main(String[] args){
        Smartphone s = new Smartphone();
        s.click();
        s.glitch();
        s.snap();
        s.call();
    }
}

/*

Second code of the interface
 // You are using Java
interface A{
    static void show(){
        System.out.println("Show me your skill");
    };
}
interface B{
    static void Run(){
        System.out.println("Run 100 meters now");
    };
}
interface C{
    static void Stop(){
        System.out.println("After 100 meters stop yourself");
    };
}
interface D{
    static void Jump(){
        System.out.println("Jump after the another person");
    };
}

class Test implements A,B,C,D{
        public void show(){
            System.out.println("Overiding A, Show me your skill");
        }
        public void Run(){
            System.out.println("Overiding B. Run 100 meters now");
        }
        public void Stop(){
            System.out.println("Overiding C");
        }
        public void Jump(){
            System.out.println("Overiding D");
        }
}

class Main{
    public static void main(String[] args){
        Test t = new Test();
        t.show();
        t.Run();
        t.Stop();
        t.Jump();
    }
}
 */


// This is the code of the interface using the lambda expression - but, this will only work for 'one abstract method' in any of the interfaces

/* 
interface E {
    void display();
}

interface F {
    void execute();
}

interface G {
    void halt();
}

interface H {
    void leap();
}

class LambdaTest {
    public static void main(String[] args) {
        E e = () -> System.out.println("Lambda: Show me your skill");
        F f = () -> System.out.println("Lambda: Run 100 meters now");
        G g = () -> System.out.println("Lambda: After 100 meters stop yourself");
        H h = () -> System.out.println("Lambda: Jump after the another person");

        e.display();
        f.execute();
        g.halt();
        h.leap();
    }
}
    */

