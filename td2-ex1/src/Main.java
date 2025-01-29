//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // Création d'un employé
        Employee employee = new Employee("Alice", "Developer", 50000);

        // Gestion du salaire
        CalculAug salaryManager = new CalculAug();
        salaryManager.applyRaise(employee, 10); // Augmentation de 10%

        // Génération du rapport
        GenerateRepport reportGenerator = new GenerateRepport();
        String report = reportGenerator.generateReport(employee);

        // Affichage du rapport
        System.out.println(report);
    }
}
