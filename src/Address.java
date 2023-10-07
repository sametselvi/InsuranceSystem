public interface Address {

    public void add(String address);
    public void remove();
    public void update(String address);

    class HomeAddress implements Address {
        private String address;

        public HomeAddress(String address) {
            this.address = address;
        }

        @Override
        public void add(String address) {

        }

        @Override
        public void remove() {

        }

        @Override
        public void update(String address) {

        }
    }

}
