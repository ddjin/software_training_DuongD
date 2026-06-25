public class App {
    private int requestRPS;
    private int currRPS;
    private double shooterDeg;
    private double currDeg;
    private boolean shootButton;
    private String toDo;

    public void main(String[] args) throws Exception {
        requestRPS = 40;
        currRPS = 44;
        shooterDeg = 50.7;
        currDeg = 40.7;
        shootButton = true;

        if (!shootButton) {
                System.out.print("Stopping Spindexer & Shooter");
            } else {
              System.out.println(startShooter());
              System.out.println(startSpindexer());
            }
    }


    public String startSpindexer() { 
      double toleranceRPS = Math.abs(currRPS - requestRPS);

      if (toleranceRPS <= 4) {
         toDo="Starting Spindexer"; 
            } else if ((currRPS- requestRPS) < 0) {
                 toDo = "Increase speed by" + toleranceRPS;
                 } else {
                      toDo = "Decrease speed by" + toleranceRPS;
                     }
         return toDo;
    }

    public String startShooter() { 
     double toleranceDeg = Math.abs(currDeg - shooterDeg);

     if (toleranceDeg <= 5){
        toDo = "Starting the Shooter";
           } else if ((currDeg - shooterDeg) < 0) {
                 toDo = "Angle further up by" + toleranceDeg;
                  } else {
                    toDo = "Angle lower by" + toleranceDeg;
              }
        return toDo;

    }

}
