class CloudStorage implements DataStorage {
    @Override
    public void save(String data) {
        // Each storage strategy is encapsulated and can vary independently
        System.out.println(data);
    }
}
