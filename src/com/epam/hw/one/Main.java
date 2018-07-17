package com.epam.hw.one;

public class Main {

    public static void main(String[] args) {
        Developer developerOne=new Developer();
        developerOne.setId(1);
        developerOne.setName("John");
        developerOne.setSurname("Word");
        developerOne.setSalary(80000);
        developerOne.setExperience(22);
        developerOne.setAge(30);
        developerOne.setGithubName("John20");
        developerOne.setCurrentProject("System Security");

        Developer developerTwo=new Developer();
        developerTwo.setId(2);
        developerTwo.setName("Ford");
        developerTwo.setSurname("Nework");
        developerTwo.setSalary(64500);
        developerTwo.setExperience(18);
        developerTwo.setAge(26);
        developerTwo.setGithubName("FordNew");
        developerTwo.setCurrentProject("Mobile app");

        Manager managerOne=new Manager();
        managerOne.setId(3);
        managerOne.setName("Howard");
        managerOne.setSurname("Dino");
        managerOne.setSalary(32000);
        managerOne.setExperience(4);
        managerOne.setAge(22);
        managerOne.setTableNumber(10);

        System.out.println(developerOne);
        System.out.println(managerOne);

    }
}
