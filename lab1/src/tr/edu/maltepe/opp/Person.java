package tr.edu.maltepe.opp;

public class Person {

    public class Person implements DoSport
    {
        private String name;
        private int id;
        private boolean isInSportCenter;
        private boolean isInSwimmingPool;
        private boolean isInFootballField;


        @Override
        public void goSportCenter( SportsCenter sportsCenter)
        {
            if (!isInSportCenter)
            {
                sportsCenter.getPeopleInSportsCenter().addElement(this);
                System.out.println(getName() + " is gone the sports center");
                isInSportCenter = true;
            }
            else
                System.out.println(getName() + " is already in sport center!");

        }

        @Override
        public void exitSportCenter(SportsCenter sportsCenter)
        {
            if (isInSportCenter)
            {
                System.out.println(this.getName() + " is exit from sports center!");
                isInSportCenter = false;
                isInFootballField = false;
                isInSwimmingPool = false;
                sportsCenter.getPeopleInSportsCenter().remove(this);
                sportsCenter.getSwimmingPool().remove(this);
                sportsCenter.getFootballField().remove(this);
            }

            else
                System.out.println("You cant exit somewhere that you are not inside of it!");
        }

        @Override
        public void swim( SportsCenter sportsCenter)
        {
            if (isInSportCenter && !isInSwimmingPool && !isInFootballField)
            {
                sportsCenter.getSwimmingPool().add(this);
                System.out.println(getName() + " is swimming");
                isInSwimmingPool = true;
            }
            else if (isInSwimmingPool)
            {
                System.out.println(getName() + " is already swimming!");
            }
            else if(isInFootballField)
            {
                System.out.println("Dear " + getName() +" if you want to swim you should exit from football field!");
            }
            else
                System.out.println("If " + getName() +" wants to swim, he/she should go sport center!");
        }

        @Override
        public void stopSwim(SportsCenter sportsCenter)
        {
            if(isInSwimmingPool)
            {
                System.out.println(getName() + " is stopped swimming!");
                isInSwimmingPool = false;
                sportsCenter.getSwimmingPool().remove(this);
            }
            else
                System.out.println("Dear " + getName() + " you cant stop doing something which you already not to do!");
        }

        @Override
        public void playFootball( SportsCenter sportsCenter)
        {
            if (isInSportCenter && !isInSwimmingPool && !isInFootballField)
            {
                sportsCenter.getFootballField().add(this);
                System.out.println(getName() + " is playing football");
                isInFootballField = true;
            }
            else if (isInFootballField)
            {
                System.out.println(getName() + " is already playing football!");
            }
            else if(isInSwimmingPool)
            {
                System.out.println("Dear " + getName() +" if you want to play football you should exit from pool!");
            }
            else
                System.out.println("If " + getName() +" wants to play football, he/she should go sport center!");

        }

        @Override
        public void stopPlayFootball(SportsCenter sportsCenter)
        {
            if(isInFootballField)
            {
                System.out.println(getName() + " is stopped playing football!");
                isInFootballField = false;
                sportsCenter.getFootballField().remove(this);
            }
            else
                System.out.println("Dear " + getName() + " you cant stop doing something which you already not to do!");
        }




        public Person(){}
        public Person(String name, int id){this.name = name; this.id = id;}
        public Person(String name, int id, boolean isInSportCenter, boolean isInSwimmingPool, boolean isInFootballField)
        {
            this.name = name;
            this.id = id;
            this.isInSportCenter = isInSportCenter;
            this.isInSwimmingPool = isInSwimmingPool;
            this.isInFootballField = isInFootballField;
        }


        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        public int getId()
        {
            return id;
        }
        public void setId(int id)
        {
            this.id = id;
        }

        public boolean getIsInSportCenter()
        {
            return isInSportCenter;
        }
        public void setIsInSportCenter(boolean inSportCenter)
        {
            isInSportCenter = inSportCenter;
        }

        public boolean getIsInSwimmingPool()
        {
            return isInSwimmingPool;
        }
        public void setInSwimmingPool(boolean inSwimmingPool)
        {
            isInSwimmingPool = inSwimmingPool;
        }

        public boolean getIsInFootballField()
        {
            return isInFootballField;
        }
        public void setIsInFootballField(boolean inFootballField)
        {
            isInFootballField = inFootballField;
        }

    }