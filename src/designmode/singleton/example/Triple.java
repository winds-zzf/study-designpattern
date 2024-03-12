package designmode.singleton.example;

class Triple {
    private static Triple[] triples = new Triple[]{new Triple(),new Triple(),new Triple()};

    private Triple(){}

    public static Triple getInstance(int id){
        if(id<0||id>2) return null;
        return triples[id];
    }
}
