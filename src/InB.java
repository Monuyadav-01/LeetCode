import java.util.Scanner;

public class InB {
    static class LinkedListNode<T> {
        T val;
        LinkedListNode<T> next;

        LinkedListNode(T val) {
            this.val = val;
            this.next = null;
        }
    }
    public static LinkedListNode<Integer> mergeInBetween(LinkedListNode<Integer> list1, int a, int b, LinkedListNode<Integer> list2) {
        // Write your code here
        LinkedListNode<Integer> dummy = new LinkedListNode<>(0);
        dummy.next = list1;

        LinkedListNode<Integer> prev = dummy;
        LinkedListNode <Integer>current = list1;

        // Move 'prev' to the (a-1)th node
        for (int i = 0; i < a - 1; i++) {
            prev = prev.next;
            current = current.next;
        }

        // Remove nodes from ath to bth
        for (int i = a; i <= b; i++) {
            current = current.next;
        }

        prev.next = list2;

        // Move 'list2' to the end of list2
        while (list2.next != null) {
            list2 = list2.next;
        }

        list2.next = current;

        return dummy.next;

    }

    public static class ReplaceLinkedListNodes {
        public static LinkedListNode<Integer> arrayToList(int[] arr) {
            if (arr.length == 0) return null;

            LinkedListNode<Integer> head = new LinkedListNode<>(arr[0]);
            LinkedListNode<Integer> temp = head;

            for (int i = 1; i < arr.length; i++) {
                temp.next = new LinkedListNode<>(arr[i]);
                temp = temp.next;
            }

            return head;
        }

        public static void printList(LinkedListNode<Integer> head) {
            LinkedListNode<Integer> temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input for list1
            String[] list1Input = scanner.nextLine().split(" ");
            int[] list1Arr = new int[list1Input.length];
            for (int i = 0; i < list1Input.length; i++) {
                list1Arr[i] = Integer.parseInt(list1Input[i]);
            }
            LinkedListNode<Integer> list1 = arrayToList(list1Arr);

            // Input for a and b
            String[] abInput = scanner.nextLine().split(" ");
            int a = Integer.parseInt(abInput[0]);
            int b = Integer.parseInt(abInput[1]);

            // Input for list2
            String[] list2Input = scanner.nextLine().split(" ");
            int[] list2Arr = new int[list2Input.length];
            for (int i = 0; i < list2Input.length; i++) {
                list2Arr[i] = Integer.parseInt(list2Input[i]);
            }
            LinkedListNode<Integer> list2 = arrayToList(list2Arr);

            scanner.close();

            LinkedListNode<Integer> result = mergeInBetween(list1, a, b, list2);
            printList(result);
        }

    }
}
