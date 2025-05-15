public class AnnotationReader {
    public static void main(String[] args) {
        Class<LoginEnhancement> obj = LoginEnhancement.class;

        if (obj.isAnnotationPresent(EnhancementRequest.class)) {
            EnhancementRequest er = obj.getAnnotation(EnhancementRequest.class);
            System.out.println("=== Enhancement Request Details ===");
            System.out.println("ID: " + er.id());
            System.out.println("Synopsis: " + er.synopsis());
            System.out.println("Engineer: " + er.engineer());
            System.out.println("Date: " + er.date());
        } else {
            System.out.println("No EnhancementRequest annotation present.");
        }
    }
} 
