public class LL {

        static  class  Node{
            private Employee data;
            private Node next;

            public Node(Employee data){
                this.data = data;
                next = null;


            }


        }

        private Node head;

        public LL(){
            head = null;
        }



        public boolean isEmpty(){
            return head == null;
        }

        public void add(Employee data){

            if(isEmpty()){
                Node node = new Node(data);
                node.next = null;
                head = node;
            }
            else {
                Node trav  = head;

                while (trav.next != null){
                    trav = trav.next;
                }
                Node node = new Node(data);
                trav.next = node;
            }

        }

        public void displayData(){
            Node trav = head;

            while (trav != null){
                System.out.println(trav.data);
                trav = trav.next;
            }
        }

        public void searchData(Employee data){
            Node trav = head;

            while (trav != null){
                if(trav.data.getName().equals(data.getName())){
                    System.out.println(trav.data);
                }
                trav = trav.next;
            }

        }

        public void deleteData(Employee data) {
            Node trav = head;
            if (trav.data.getId() == data.getId()) {
                //if id found at 1st
                head = trav.next;
            } else  {
                boolean isDeleted = false;
                while (trav.next != null) { // this does not handle last employee condition
                    if (trav.next.next!=null && trav.next.data.getId() == data.getId()){
                        trav.next = trav.next.next;
                        isDeleted = true;
                        break;
                    }
                    trav = trav.next;
                }

                Node newTrav = head;

                while (newTrav.next.next!= null){
                    newTrav = newTrav.next;

                }
                if(!isDeleted){
                    newTrav.next = null;
                }

            }
        }

}

