package adneom.skillTesting;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdneomSkillTest {

    @Test
    public void testPartitionWithNullTab() {
        AdneomSkill adneomSkill = new AdneomSkill();
        List<Integer> tab = null;
        List<List<Integer>> partitions = adneomSkill.partition(tab, 1);

        Assert.assertTrue(partitions.size() == 0);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testPartitionWithBadSizeParam() {
        AdneomSkill adneomSkill = new AdneomSkill();
        List<String> tab = new ArrayList<>();
        adneomSkill.partition(tab, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPartitionWithBadSizeParam2() {
        AdneomSkill adneomSkill = new AdneomSkill();
        List<String> tab = new ArrayList<>();
        List<List<String>> partitions = adneomSkill.partition(tab, -1);
    }

    @Test
    public void testPartitionWithEmptyTab() {
        AdneomSkill adneomSkill = new AdneomSkill();
        List<String> tab = new ArrayList<>();
        List<List<String>> partitions = adneomSkill.partition(tab, 5);
        Assert.assertTrue(partitions.size() == 0);
    }

    @Test
    public void testPartitionCase1() {
        AdneomSkill adneomSkill = new AdneomSkill();
        List tab = Arrays.asList(1, 2, 3, 4);
        List expected1 = Arrays.asList(1, 2);
        List expected2 = Arrays.asList(3, 4);

        List<List> partitions = adneomSkill.partition(tab, 2);
        Assert.assertTrue(partitions.size() == 2);
        Assert.assertEquals(expected1, partitions.get(0));
        Assert.assertEquals(expected2, partitions.get(1));
    }

    @Test
    public void testPartitionCase2() {
        AdneomSkill adneomSkill = new AdneomSkill();
        List tab = Arrays.asList("Hello", 5, 9, "Costa", 19);
        List expected1 = Arrays.asList("Hello", 5);
        List expected2 = Arrays.asList(9, "Costa");
        List expected3 = Arrays.asList(19);
        List<List> partitions = adneomSkill.partition(tab, 2);
        Assert.assertTrue(partitions.size() == 3);
        Assert.assertEquals(expected1, partitions.get(0));
        Assert.assertEquals(expected2, partitions.get(1));
        Assert.assertEquals(expected3, partitions.get(2));
    }

    @Test
    public void testPartitionCase3() {
        AdneomSkill adneomSkill = new AdneomSkill();
        List tab = Arrays.asList(1, 2, 3, 4);
        List expected1 = Arrays.asList(1);
        List expected2 = Arrays.asList(2);
        List expected3 = Arrays.asList(3);
        List expected4 = Arrays.asList(4);
        List<List> partitions = adneomSkill.partition(tab, 1);
        Assert.assertTrue(partitions.size() == 4);
        Assert.assertEquals(expected1, partitions.get(0));
        Assert.assertEquals(expected2, partitions.get(1));
        Assert.assertEquals(expected3, partitions.get(2));
        Assert.assertEquals(expected4, partitions.get(3));
    }

    @Test
    public void testPartitionCase4() {
        AdneomSkill adneomSkill = new AdneomSkill();
        List tab = Arrays.asList(1, 2, 3, 4);
        List expected1 = Arrays.asList(1, 2, 3, 4);
        List<List> partitions = adneomSkill.partition(tab, 6);
        Assert.assertTrue(partitions.size() == 1);
        Assert.assertEquals(expected1, partitions.get(0));
    }


}