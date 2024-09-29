        import image.*;
        import world.*;

        public class Game2 extends World{
            public static void main(String[] args){
                new Game2()
                     .bigBang();
            }
            Scene scene;
            Ball ball;
            ILoRect lor;
            Game2(){
                 this.scene = new EmptyScene(1000, 600);
                // this.p = new Posn(100, 300);
                 this.ball = new Ball(new Posn(100, 300));
                 this.lor = new MtLoRect();
                 this.lor = new ConsLoRect(new Rect(new Posn(170, 330)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(70, 330)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(990, 330)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(0, 300)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(470, 300)), this.lor);
                 this.lor = new ConsLoRect(new Rect(new Posn(570, 300)), this.lor);
            }

            Game2(Scene scene, Ball ball, ILoRect lor){
                  this.scene = scene;
                  this.ball = ball;
                  this.lor = lor;
           }


            public Game2 onTick(){
             // move all posns
              return new Game2(this.scene, this.ball, this.lor.move());
            }



            public Scene onDraw() {

    Scene updatedScene = this.ball.draw(this.scene);
    updatedScene = this.lor.draw(updatedScene);

    int platform1X = 100;
    int platform1Y = 1120;
    int platform1Width = 150;
    int platform1Height = 1620;

    int platform2X = 300;
    int platform2Y = 1120;
    int platform2Width = 150;
    int platform2Height = 1620;

    int platform3X = 500;
    int platform3Y = 1120;
    int platform3Width = 150;
    int platform3Height = 1620;

    int platform4X = 700;
    int platform4Y = 1120;
    int platform4Width = 150;
    int platform4Height = 1620;

    int platform5X = 900;
    int platform5Y = 1120;
    int platform5Width = 150;
    int platform5Height = 1620;



    updatedScene = updatedScene.placeImage(new Rectangle(platform1Width, platform1Height, "solid", "blue"), platform1X, platform1Y);
    updatedScene = updatedScene.placeImage(new Rectangle(platform2Width, platform2Height, "solid", "green"), platform2X, platform2Y);
    updatedScene = updatedScene.placeImage(new Rectangle(platform3Width, platform3Height, "solid", "yellow"), platform3X, platform3Y);
    updatedScene = updatedScene.placeImage(new Rectangle(platform4Width, platform4Height, "solid", "orange"), platform4X, platform4Y);
    updatedScene = updatedScene.placeImage(new Rectangle(platform5Width, platform5Height, "solid", "purple"), platform5X, platform5Y);


    return updatedScene;
}




            public Game2 onMouse(int x, int y, String me){
                if(me.equals("button-down")){
                    return new Game2(this.scene, new Ball(new Posn (500, 300)), this.lor);
                } else {
                  return this;
                }
           }

            public boolean stopWhen (){
              return this.lor.anyCloseTo(this.ball);
            }


            public Scene lastScene(){
              return new EmptyScene(1000, 1000).placeImage(new Text("Game Over!", 25, "red"), 530, 100);
            }

            public Game2 onKey( String ke){
              return new Game2(this.scene, this.ball.move(ke), this.lor);
                  }
            }


        class Rect {
         Posn p ;
         Rect (Posn p) {
           this. p = p;
         }
         Rect move(){
            if (this.p.y <= 800) {
              return new Rect(
                      new Posn(this.p.x + 3,
                               this.p.y + 5));

              } else if (this.p.x >= 980) {
                 return new Rect(
                      new Posn(this.p.x - 930,
                               0));

              } else {
                 return new Rect(
                      new Posn(this.p.x -8,
                               this.p.y -994));
              }

         }
        Scene draw(Scene scene){
                   return scene.placeImage(new Rectangle(140, 20, "solid", "black"), this.p.x, this.p.y);

                  }
        }


       interface ILoRect{
          ILoRect move();
          boolean anyCloseTo(Ball other);
          Scene draw(Scene scene);
        }
        class MtLoRect  implements ILoRect{
          MtLoRect(){}
          public ILoRect move(){
           return this;
          }
          public  boolean anyCloseTo(Ball other){
            return false;
          }
          public    Scene draw(Scene scene){
            return scene;
          }
        }
        class ConsLoRect implements ILoRect{
         Rect fst;
         ILoRect rst;
         ConsLoRect(Rect fst, ILoRect rst){
          this.fst = fst;
          this.rst = rst;
         }
          public ILoRect move(){
           return new ConsLoRect(this.fst.move()
                              , this.rst.move());
          }
          public  boolean anyCloseTo(Ball other){
            return other.closeTo(this.fst.p) ||
                 this.rst.anyCloseTo(other);
          }
          public    Scene draw(Scene scene){
            return this.rst.draw(this.fst.draw(scene));
          }
        }
        class Ball {
          Posn p;
          Ball(Posn p) {
           this.p = p;
          }
          Ball move(String ke){
             if(ke.equals("left")){
                    if (this.p.x > 100) {
                      return new Ball(new Posn (this.p.x -200, this.p.y));
                    } else {
                      return this;
                    }
                } else
                if(ke.equals("right")){
                  if (this.p.x < 900) {
                    return new Ball(new Posn(this.p.x + 200, this.p.y ));
                  } else {
                    return this;
                  }
                  } else {
                  return this;
                  }
          }
                  Scene draw(Scene scene){
                   return scene.placeImage(new Circle(10, "solid", "red"), this.p.x, this.p.y);

                  }
                  boolean closeTo(Posn other){
                     return (Math.abs(this.p.x - other.x) < 30) && (Math.abs(this.p.y - other.y) < 30);

                  }
        }
        interface ILoP{
          ILoP moveAll();
        }
        class MtLoP  implements ILoP{
          MtLoP(){}
          public ILoP moveAll(){
           return this;
          }
        }
        class ConsLoP implements ILoP{
         Posn fst;
         ILoP rst;
         ConsLoP(Posn fst, ILoP rst){
          this.fst = fst;
          this.rst = rst;
         }
          public ILoP moveAll(){
           return new ConsLoP(new Posn(this.fst.x+ 3, this.fst.y + 3)
                              , this.rst.moveAll());
          }
        }
