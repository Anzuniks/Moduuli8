# Moduuli 8 - Koulutehtävät

## Projektin Struktuuri

Tämä projekti sisältää Moduuli 8:n tehtävät järjestettyinä selkeästi omiin paketteihinsa.

### Pakettirakenne

```
src/main/java/
├── moduuli8_1/
│   ├── task1/
│   │   └── Main.java       (Tehtävä 8.1.1)
│   └── task2/
│       └── Main.java       (Tehtävä 8.1.2)
├── moduuli8_2/
│   ├── task1/
│   │   └── Main.java       (Tehtävä 8.2.1)
│   └── task2/
│       └── Main.java       (Tehtävä 8.2.2)
└── moduuli8_3/
    ├── task1/
    │   └── Main.java       (Tehtävä 8.3.1)
    └── task2/
        └── Main.java       (Tehtävä 8.3.2)
```

### Tehtävien Suorittaminen

Jokainen tehtävä voidaan suorittaa erikseen omasta Main-luokastaan:

- **Moduuli 8.1:**
  - Task 1: `moduuli8_1.task1.Pen`
  - Task 2: `moduuli8_1.task2.Main`

- **Moduuli 8.2:**
  - Task 1: `moduuli8_2.task1.Main`
  - Task 2: `moduuli8_2.task2.Main`

- **Moduuli 8.3:**
  - Task 1: `moduuli8_3.task1.Main`
  - Task 2: `moduuli8_3.task2.Main`

### Lisäluokkien Luominen

Kun luot lisäluokkia tehtäviin, laita ne samaan pakettiin Main-luokan kanssa:

Esimerkki: Jos teet luokan `Person` tehtävään 8.1.1, luo se:
```
src/main/java/moduuli8_1/task1/Person.java
```

Ja käytä oikeaa package-määrittelyä:
```java
package moduuli8_1.task1;

public class Person {
    // ...
}
```

### Huomioitavaa

- Jokainen tehtävä on omassa paketissaan, joten nimet eivät mene sekaisin
- Voit käyttää samoja luokkanimiä eri tehtävissä (esim. `Person`) koska ne ovat eri paketeissa
- Maven-projekti, joten voit käyttää Mavenin komentoja buildaamiseen ja suorittamiseen

Onnea tehtävien tekemiseen! 🚀

