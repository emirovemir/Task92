package T72new;

    import java.util.Date;

    public class Food extends Products {

        private Date expirationDate;
        public Food(String name, Date expirationDate) {
            super(name);
            this.expirationDate = expirationDate;

        }

        public Date getExpirationDate() {
            return expirationDate;
        }

        @Override
        public String toString() {
            return getName();
        }
    }
