package Streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private List<Order> orders;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        User user = (User) obj;
        if (user.getId() == this.getId()) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}