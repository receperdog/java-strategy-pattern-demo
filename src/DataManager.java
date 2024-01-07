/**
 * 'DataManager' demonstrates the 'Favor composition over inheritance' principle.
 * It composes its behavior based on the DataStorage strategy it uses.
 */
class DataManager {
    private DataStorage storage; // Composition of a DataStorage strategy

    public DataManager(DataStorage storage) {
        this.storage = storage;
    }

    public void saveData(String data) {
        storage.save(data); // Delegates the save operation to the current storage strategy
    }

    // Allows changing the storage strategy at runtime, demonstrating flexibility
    public void setDataStorage(DataStorage newStorage) {
        this.storage = newStorage;
    }
}
