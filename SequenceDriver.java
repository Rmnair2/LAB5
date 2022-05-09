public class SequenceDriver
{
   public static void main(String[] args)
   {
      Sequence firstSequence = new Sequence();
      firstSequence.add(1);
      firstSequence.add(4);
      firstSequence.add(9);
      firstSequence.add(16);
      System.out.print("First before: ");
      System.out.println(firstSequence);

      Sequence secondSequence = new Sequence();
      secondSequence.add(9);
      secondSequence.add(7);
      secondSequence.add(4);
      secondSequence.add(9);
      secondSequence.add(11);
      System.out.print("Second before: ");
      System.out.println(secondSequence);

      Sequence combinedSequence = firstSequence.append(secondSequence);
      System.out.println("Appended: " + combinedSequence);
      System.out.println("Expected: [1, 4, 9, 16, 9, 7, 4, 9, 11]");

      System.out.print("First after: ");
      System.out.println(firstSequence);

      System.out.print("Second after: ");
      System.out.println(secondSequence);

      
      System.out.print("Merged: ");
      Sequence mergedSequence = firstSequence.merge(secondSequence);
      System.out.println(mergedSequence);

      System.out.print("Merged and Sorted: ");
      Sequence mergedSortSequence = firstSequence.mergeSorted(secondSequence);
      System.out.println(mergedSortSequence);

      System.out.print("Merged and No Duplicates: ");
      Sequence mergedNoDup = mergedSequence.removeDuplicates();
      System.out.println(mergedNoDup);











      
   }
}