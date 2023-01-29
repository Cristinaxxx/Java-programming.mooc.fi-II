
public class MainProgram {

    public static void main(String[] args) {
        
        Person Arto = new Person("Arto", Education.PHD);
        Person Sanna = new Person("Sanna", Education.MA);
        Person Andrea = new Person("Andrea", Education.HS);
        Person Sofia = new Person("Sofia", Education.BA);

        Employees employees = new Employees();
        
        employees.add(Arto);
        employees.add(Sanna);
        employees.add(Andrea);
        employees.add(Sofia);
        
        employees.print();
        employees.print(Education.MA);

    }
}
