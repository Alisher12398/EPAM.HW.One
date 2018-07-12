public class Main {

    public static void main(String[] args) {
        Developer DeveloperOne=new Developer();
        DeveloperOne.setId(1);
        DeveloperOne.setName("John");
        DeveloperOne.setSurname("Word");
        DeveloperOne.setSalary(80000);
        DeveloperOne.setExperience(22);
        DeveloperOne.setAge(30);
        DeveloperOne.setGithubName("John20");
        DeveloperOne.setCurrentProject("System Security");

        Developer DeveloperTwo=new Developer();
        DeveloperTwo.setId(2);
        DeveloperTwo.setName("Ford");
        DeveloperTwo.setSurname("Nework");
        DeveloperTwo.setSalary(64500);
        DeveloperTwo.setExperience(18);
        DeveloperTwo.setAge(26);
        DeveloperTwo.setGithubName("FordNew");
        DeveloperTwo.setCurrentProject("Mobile app");

        Manager ManagerOne=new Manager();
        ManagerOne.setId(3);
        ManagerOne.setName("Howard");
        ManagerOne.setSurname("Dino");
        ManagerOne.setSalary(32000);
        ManagerOne.setExperience(4);
        ManagerOne.setAge(22);
        ManagerOne.setTableNumber(10);

        System.out.println(DeveloperOne);
        System.out.println(ManagerOne);

    }
}
