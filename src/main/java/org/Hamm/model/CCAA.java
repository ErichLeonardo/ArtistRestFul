package org.Hamm.model;

public enum CCAA {
    Andalucía("Andalucía"),
    Aragón("Aragon"),
    Asturias("Asturias"),
    Baleares("Baleares"),
    Canarias("Canarias"),
    Cantabria("Cantabria"),
    Castilla_y_Léon("Castilla y Léon"),
    Castilla_la_Mancha("Castilla la Mancha"),
    Cataluña("Cataluña"),
    Comunitat_Valenciana("Comunitat Valenciana"),
    Extremadura("Extremadura"),
    Galicia("Galicia"),
    Madrid("Madrid"),
    Murcia("Murcia"),
    Navarra("Navarra"),
    País_Vasco("Pais Vasco"),
    Rioja("Rioja"),
    Ceuta("Ceuta"),
    Melilla("Melilla");

    private String name;

    CCAA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
