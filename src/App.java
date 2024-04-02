public class App {
    public static void main(String[] args) {
        // Test avec des entiers
        StorageGenerique<Integer> storageInt = new StorageGenerique<>();
        storageInt.addElement(10);
        storageInt.addElement(20);
        System.out.println("Élément à l'index 0 : " + storageInt.getElement(0));
        storageInt.removeElement(0);
        System.out.println("Taille de la liste : " + storageInt.getSize());

        // Test avec des chaînes de caractères
        StorageGenerique<String> storageString = new StorageGenerique<>();
        storageString.addElement("Bonjour");
        storageString.addElement("Monde");
        System.out.println("Élément à l'index 1 : " + storageString.getElement(1));

        // Test avec des nombres décimaux
        StorageGenerique<Double> storageDouble = new StorageGenerique<>();
        storageDouble.addElement(3.14);
        storageDouble.addElement(2.718);
        System.out.println("Taille de la liste : " + storageDouble.getSize());
    }
}
