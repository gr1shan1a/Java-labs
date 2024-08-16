package comporators;

import collection.StudyGroup;
import java.util.Comparator;

public class StudyGroupComporator {

    public class CityComparator implements Comparator<StudyGroup> {

        /**
         * Compares two StudyGroup objects based on their natural order using the compareTo method.
         * @param o1 the first StudyGroup object to be compared
         * @param o2 the second StudyGroup object to be compared
         * @return a negative integer, zero, or a positive integer as the first argument
         *         is less than, equal to, or greater than the second.
         */
        @Override
        public int compare(StudyGroup o1, StudyGroup o2) {
            if (o1 == null) {
                if (o2 == null) {
                    return 0;
                } else {
                    return -1;
                }
            }
            return o1.compareTo(o2);
        }
    }
}
