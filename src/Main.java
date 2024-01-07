public class Main {
    public static void main(String[] args) {
        DataStorage fileStorage = new FileStorage();
        DataStorage cloudStorage = new CloudStorage();

        DataManager dataManager = new DataManager(fileStorage);

        // Initially saving data to a file
        dataManager.saveData("Data to be saved in a file");

        // Changing the storage strategy at runtime to cloud storage
        dataManager.setDataStorage(cloudStorage);

        // Now saving data to the cloud
        dataManager.saveData("Data to be saved in the cloud");
    }

}