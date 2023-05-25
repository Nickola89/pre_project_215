package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Wood3 {
    private final Rabbit4 rabbit;

    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }

}
