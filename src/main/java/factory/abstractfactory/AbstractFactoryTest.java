
package factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String args[]){
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNode();
        factory.createVideo();
    }
}
