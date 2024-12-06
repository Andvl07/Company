package Gazet;


class Newspaper {
    private String name;
    private int circulation;
    private int pages;

    public Newspaper(String name, int circulation, int pages) {
        this.name = name;
        this.circulation = circulation;
        this.pages = pages;
    }

    public String info() {
        return "Название: " + name + ", Тираж: " + circulation + ", Количество полос: " + pages;
    }

    public void changeName(String newName) {
        if (newName == null || newName.isEmpty()) {
            throw new IllegalArgumentException("Название газеты не может быть пустым.");
        }
        this.name = newName;
    }

    public void changeNumber(int newPages) {
        if (newPages <= 0) {
            throw new IllegalArgumentException("Количество полос должно быть положительным числом.");
        }
        this.pages = newPages;
    }

    public String getName(){
        return name;
    }
    
    public int getCirculation(){
        return circulation;
    }

    public int getPages(){
        return pages;
    }
}



