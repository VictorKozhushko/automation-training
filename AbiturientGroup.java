import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AbiturientGroup {
    public static void main(String[] args) {
        List<Abiturient> group = new ArrayList<Abiturient>();
        Abiturient abiturient = new Abiturient(123, "Игорь", "Михайлов", "Иванович", new int[] {72, 83, 90 });
        Abiturient abiturient1 = new Abiturient(921, "Алексей", "Орлов", "Петрович", new int[] {81, 64, 77});
        Abiturient abiturient2 = new Abiturient(825, "Светлана", "Николаенко", "Евгеньевна","ул. Хуторянского д. 54", 375448416, new int[] {76,49,81});
        Abiturient abiturient3 = new Abiturient(743, "Анна", "Кулевская", "Петровна", "ул. Витебская 29", 23457834, new int[] {81, 65, 92});

        group.add(abiturient);
        group.add(abiturient1);
        group.add(abiturient2);
        group.add(abiturient3);

        Iterator<Abiturient> iter =  group.iterator();
        
        
        while (iter.hasNext()) {

            System.out.println(iter.next().getMarkValue());

        }
        List<Abiturient> passedExam = group.stream().filter(o1 -> o1.getMarkValue()> 230).collect(Collectors.toList());

        System.out.println(passedExam);
      
    }
}
