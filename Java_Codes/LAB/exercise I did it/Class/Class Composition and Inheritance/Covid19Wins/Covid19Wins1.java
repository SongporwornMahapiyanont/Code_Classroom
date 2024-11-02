package Covid19Wins;


import java.util.Scanner;

   public class Covid19Wins1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    
    String[] namePlace = new String[N];
    int[] Idplace = new int[N];
    for(int i=0;i<N;i++)
    {
        int datePerson = scan.nextInt();
        String namePerson = scan.next();
        namePlace[i] = namePerson;
        Idplace[i] = datePerson;
    }


    String namePerson = scan.next();
    Person person = new Person(namePerson);


    int u = scan.nextInt();
    Visitation[] v = new Visitation[u];
    for(int i=0;i<u;i++)
    {
        int id = scan.nextInt();
        int date = scan.nextInt();
        final int K = scan.nextInt();
        v[i] = new Visitation(id, date);
        for(int j=0;j<K;j++)
        {
            int T = scan.nextInt();
            v[i].visit(T);
        }
        person.addVisitation(v[i]);
    }
    System.out.println(person.v.size());
    for(int i=0;i<person.v.size();i++)
    {
        int o = 0;
        for(int j=0;j<N;j++)
        {
            if(Idplace[j] == person.v.get(i).id)
            {
                o = j;
            }
        }
        person.printAllVisitations(i, namePlace[o]);
    }
    // Create object and correctly use it here
    scan.close();
    }
}
