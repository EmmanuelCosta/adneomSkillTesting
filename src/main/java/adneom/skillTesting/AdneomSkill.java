package adneom.skillTesting;

import java.util.ArrayList;
import java.util.List;

public class AdneomSkill {


    /**
     * this function will divide a list into its sub-list whose size will not exceed the given size
     *
     * @param tab  : source list to be divided
     * @param size : max size of the sub list
     * @param <T>
     * @return A representation of list o sub-list
     */
    public <T> List<List<T>> partition(List<T> tab, int size) {

        if (size <= 0) {
            throw new IllegalArgumentException("The given size can not be lower or equal to zero");
        }
        List<List<T>> partedList = new ArrayList<>();

        if (tab == null || tab.size() == 0) {
            return partedList;
        }
        for (int i = 0; i < tab.size(); i = i + size) {
            List<T> ts = null;
            if (i + size > tab.size()) {
                ts = tab.subList(i, tab.size());
            } else {
                ts = tab.subList(i, i + size);
            }

            partedList.add(ts);
        }

        return partedList;
    }
}
