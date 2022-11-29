import java.util.Objects;

public class Scene {
    private Mood mood;
    private LunchTime lunchTime;
    public PersonScene persons;

    Scene(Mood mood, LunchTime lunchTime, int countPerson) {
        this.mood = mood;
        this.lunchTime = lunchTime;
        persons = new PersonScene(countPerson);
        sayScene();
    }
    
    private void sayScene() {
        System.out.printf("Сегодня %s %s\n", mood.getName(), lunchTime.getName());
    }

    public enum Mood {
        INTERESTING,
        BEAUTIFUL,
        BAD,
        HAPPY;

        String getName() {
            String[] sceneMood = {"Интересный", "Прекрасный", "Плохой", "Веселый"};
            return sceneMood[this.ordinal()];
        }
    }
    public class PersonScene {
        private Person[] persons;
        private int currentPerson = 0;
        private int maxPerson = 0;
        public PersonScene(int countPerson) {
            maxPerson = countPerson;
            persons = new Person[maxPerson];
        }

        public void addPerson(Person person) {
            if (currentPerson >= maxPerson) {System.out.println("Колличество человек на сцене уже равно максимальному"); return;}
            persons[currentPerson++] = person;

        }
        public Person getPerson(String name) {
            for(int i = 0; i< maxPerson; i++) {
                if(name.equals(persons[i].getName())) {
                    return persons[i];
                }
            }
            System.out.println("Нет персоны с таким именем");
            return null;
        }
    }

    public enum LunchTime {
        BREAKFAST,
        BRUNCH,
        LUNCH,
        DINNNER;

        String getName() {
            String[] time = {"Завтрак", "Поздний завтрак", "Обед", "Ужин"};
            return time[this.ordinal()];
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(mood, lunchTime);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        else if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return this.mood == ((Scene) obj).mood && this.lunchTime == ((Scene) obj).lunchTime;
    }
    @Override
    public String toString() {
        return "Scene{\n" +  "mood: " + this.mood + "\nlunchTime:" + this.lunchTime + "\n}";
    }
}
