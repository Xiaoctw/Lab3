package src.application;

import org.junit.Test;
import src.edge.MovieActorRelation;
import src.edge.MovieDirectorRelation;
import src.edge.SameMovieHyperEdge;
import src.vertex.Actor;
import src.vertex.Director;
import src.vertex.Movie;
import src.vertex.Person;
import src.graph.*;
import src.vertex.*;
import src.edge.*;
import src.graph.MoiveGraphFactory;
import java.util.Arrays;

public class MovieGraphApp {

    @Test
    public void CreateMovieGraph(){
      //  MovieGraph graph=new MovieGraph();
        MoiveGraphFactory factory=new MoiveGraphFactory();
        MovieGraph graph= (MovieGraph) factory.createGraph("filepath");
        Actor actor1=new Actor("actor1");
        Actor actor2=new Actor("actor2");
        Actor actor3=new Actor("actor3");
        Actor actor4=new Actor("actor4");
        Actor actor5=new Actor("actor5");
        Actor actor6=new Actor("actor6");
        Actor actor7=new Actor("actor7");
        Person xiao=new Person("xiao");
        Movie movie1=new Movie("movie1");
        Movie movie2=new Movie("movie2");
        Movie movie3=new Movie("movie3");
        Director director1=new Director("director1");
        Director director2=new Director("director2");
        MovieDirectorRelation movieDirectorRelation1=new MovieDirectorRelation("edge1");
        MovieDirectorRelation movieDirectorRelation2=new MovieDirectorRelation("edge2");
        MovieDirectorRelation movieDirectorRelation3=new MovieDirectorRelation("edge3");
        MovieActorRelation movieActorRelation1=new MovieActorRelation("edge4",1.0);
        MovieActorRelation movieActorRelation2=new MovieActorRelation("edge5",2.0);
        MovieActorRelation movieActorRelation3=new MovieActorRelation("edge6",1.5);
        MovieActorRelation movieActorRelation4=new MovieActorRelation("edge7",2.1);
        MovieActorRelation movieActorRelation5=new MovieActorRelation("edge8",1.8);
        MovieActorRelation movieActorRelation6=new MovieActorRelation("edge9",1.9);
        MovieActorRelation movieActorRelation7=new MovieActorRelation("edge10",1.6);
        MovieActorRelation movieActorRelation8=new MovieActorRelation("edge11",1.5);
        SameMovieHyperEdge sameMovieHyperEdge1=new SameMovieHyperEdge("edge12");
        SameMovieHyperEdge sameMovieHyperEdge2=new SameMovieHyperEdge("edge13");
        SameMovieHyperEdge sameMovieHyperEdge3=new SameMovieHyperEdge("edge14");
        xiao.fillVertexInfo(new String[]{"male","19"});
        actor1.fillVertexInfo(new String[]{"20","female"});
        actor2.fillVertexInfo(new String[]{"30","male"});
        actor3.fillVertexInfo(new String[]{"29","female"});
        actor4.fillVertexInfo(new String[]{"40","male"});
        actor5.fillVertexInfo(new String[]{"29","female"});
        actor6.fillVertexInfo(new String[]{"28","male"});
        actor7.fillVertexInfo(new String[]{"30","female"});
        movie1.fillVertexInfo(new String[]{"2014","China","8.5"});
        movie2.fillVertexInfo(new String[]{"2018","America","6.8"});
        movie3.fillVertexInfo(new String[]{"2017","Japan","8.8"});
        director1.fillVertexInfo(new String[]{"60","male"});
        director2.fillVertexInfo(new String[]{"47","male"});
        movieDirectorRelation1.addVertices(Arrays.asList(director1,movie1));
        movieDirectorRelation2.addVertices(Arrays.asList(director2,movie2));
        movieDirectorRelation3.addVertices(Arrays.asList(director2,movie3));
        movieActorRelation1.addVertices(Arrays.asList(actor1,movie1));
        movieActorRelation2.addVertices(Arrays.asList(movie1,actor2));
        movieActorRelation3.addVertices(Arrays.asList(movie2,actor2));
        movieActorRelation4.addVertices(Arrays.asList(movie2,actor3));
        movieActorRelation5.addVertices(Arrays.asList(movie2,actor4));
        movieActorRelation6.addVertices(Arrays.asList(movie3,actor5));
        movieActorRelation7.addVertices(Arrays.asList(actor3,actor6));
        movieActorRelation8.addVertices(Arrays.asList(actor7,movie3));
        sameMovieHyperEdge1.addVertices(Arrays.asList(actor1,actor2));
        sameMovieHyperEdge2.addVertices(Arrays.asList(actor2,actor3,actor4));
        sameMovieHyperEdge3.addVertices(Arrays.asList(actor5,actor6,actor7));
        graph.addVertices(actor1,actor2,actor3,actor4,actor5,actor6,actor7);
        graph.addVertices(director1,director2);
        graph.addVertices(movie1,movie2,movie3);
        graph.addEdges(movieActorRelation1,movieActorRelation2,movieActorRelation3,movieActorRelation4,movieActorRelation5,movieActorRelation6,movieActorRelation7,movieActorRelation8);
        graph.addEdges(movieDirectorRelation1,movieDirectorRelation2,movieDirectorRelation3);
        graph.addEdges(sameMovieHyperEdge1,sameMovieHyperEdge2,sameMovieHyperEdge3);
        System.out.println(sameMovieHyperEdge1);
    }
}
