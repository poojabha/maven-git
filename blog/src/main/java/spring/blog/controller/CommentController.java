//package spring.blog.view;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import spring.blog.controller.ArticleController;
//import spring.blog.controller.CommentController;
//
//import spring.blog.controller.UserController;
//import spring.blog.model.*;
//
//
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/comment")
//public class CommentView {
//    @Autowired
//    CommentController commentController;
//    @Autowired
//    ArticleController articleController;
//    @Autowired
//    UserController userController;
//    @GetMapping(value = "/all")
//    public List<Comment> getAll()
//    {
//        return  commentController.findAll();
//    }
////    @PostMapping(path="/load")
////    public Comment save(@RequestBody final Comment comment)    {
////
////        User user=userController.findArticle(comment.getArticle());
////        comment.setUser(user);
////        Article article=articleController.findById(id1);
////        comment.setArticle(article);
////        commentController.save(comment);
////        return commentController.findById(comment.getId());
////
////    }
//
//}
