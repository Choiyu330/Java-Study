import java.util.*;

public class computeCount {
    public long computeCount(List<Member> members) {
        long count = members.stream()
                .filter(m -> m.getGender().equals("Female"))
                .count();
        return count;
    }

    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }
}
