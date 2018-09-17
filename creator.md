# Creator

> Problem: Who should be responsible for creating a new instance of some class?

> Solution: Assign class B the responsibility to create an instance of class A if one or more of the following is true:

* B contains (aggregates) A objects.
* B records instances of A objects.
* B closely uses A.
* B has the initializing data that will be passed to A when it is created (thus B is an Expert with respect to creating A).

## Example
> Who is responsible of creating the object?

![](/img/creator_doc_page_1.png)

![](/img/creator_doc_page_2.png)




````     
public class Page {

    private String content;

    public void addContent(String content){
        this.content = this.content + " " + content;
    }
}

````     

````     
import java.util.List;

public class Document {

    private List<Page> pages;

    public void newPage(){
        pages.add(new Page());
    }
}

````     


## Example II
> Who is responsible of creating the object?

![](/img/creator_car_driver_engine_1.png)

![](/img/creator_car_driver_engine_2.png)




````     


````     

````     


````     

