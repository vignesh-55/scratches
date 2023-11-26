interface Parent{
    Child display();
}

class Child implements Parent {

    @Override
    public Parent display() {
        return null;
    }
}