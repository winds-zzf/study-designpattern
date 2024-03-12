package designmode.factory.example;

import java.util.ArrayList;
import java.util.List;

class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners(){
        return owners;
    }
}
