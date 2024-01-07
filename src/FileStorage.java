/**
 * 'FileStorage' and 'CloudStorage' are concrete strategies that implement the DataStorage interface.
 * This demonstrates the 'Take what varies and encapsulate it' principle.
 */
class FileStorage implements DataStorage {
    @Override
    public void save(String data) {
        // This could be extended or modified independently from other storage strategies
        System.out.println(data);
    }
}
