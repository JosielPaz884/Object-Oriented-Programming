package josiel;

import robocode.*;
import robocode.util.Utils;

public class Josiel extends Robot { //Herança da classe Robot da biblioteca robocode
    
    private double enemyHeading;
    private double enemyDistance;
    private double enemyBearing;
    private boolean superShotReady = true; 

  //Método para rodar o Robô
    public void run() {
        setAdjustRadarForRobotTurn(true);
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
            turnRadarRight(360);
        }
    }
	//Métodos de como o robô funcionará e instruções de como suas habilidades funcionarão
    public void onScannedRobot(ScannedRobotEvent e) {
        enemyHeading = e.getHeading();
        enemyDistance = e.getDistance();
        enemyBearing = e.getBearing();
        attackEnemy();
    }

    private void attackEnemy() {
        turnRight(enemyBearing);
        double enemyFutureX = getX() + Math.sin(Math.toRadians(enemyHeading)) * enemyDistance;
        double enemyFutureY = getY() + Math.cos(Math.toRadians(enemyHeading)) * enemyDistance;
        double angleToFutureEnemy = Math.toDegrees(Math.atan2(enemyFutureX - getX(), enemyFutureY - getY()));
        double turnGunAngle = Utils.normalRelativeAngleDegrees(angleToFutureEnemy - getGunHeading());
        turnGunRight(turnGunAngle);
        if (enemyDistance < 100) {
            fire(3); 
        } else if (enemyDistance < 200) {
            fire(2);
        } else {
            fire(1); 
        }
        if (superShotReady && enemyDistance < 150) {
            fire(4); 
            superShotReady = false;
        }
        evade();
    }

    private void evade() {
        double turnAngle = enemyHeading + 90; 
        turnRight(turnAngle);
        ahead(50);
    }

    public void onHitByBullet(HitByBulletEvent e) {
        back(10);
    }

    public void onHitWall(HitWallEvent e) {
        back(20);
    }

    public void onRobotDeath(RobotDeathEvent e) {
        superShotReady = true;
    }

    public void onRoundEnded(RoundEndedEvent e) {
        superShotReady = true; 
    }
}
