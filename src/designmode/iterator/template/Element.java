package designmode.iterator.template;

class Element {
    private String field;

    public Element(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Element{" +
                "field='" + field + '\'' +
                '}';
    }
}
