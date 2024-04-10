package com.nabanita.TestProduct.controller;

import com.nabanita.TestProduct.model.UserModel;
import com.nabanita.TestProduct.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.hibernate.sql.ast.SqlTreeCreationLogger.LOGGER;

@RestController
@RequestMapping("/users")
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody UserModel userModel){

        ResponseEntity<String> resp=null;

        try {
            //if product Id exists
            if(userModel.getId()!=null
                    && userService.isUserExists(userModel.getId())
            )
            {
                resp = new ResponseEntity<String>(
                        "Given Id '"+userModel.getId()+"' Data already exist",
                        HttpStatus.BAD_REQUEST);

            } else { //Product id not exist
                Long id=userService.saveProduct(userModel);
                resp = new ResponseEntity<String>(
                        "Product '"+id+"' created Successfully!",
                        //HttpStatus.OK //200
                        HttpStatus.CREATED //201
                );
            }

        } catch (Exception e) {
            resp = new ResponseEntity<String>(
                    "Unable to Save Product",
                    HttpStatus.INTERNAL_SERVER_ERROR //Our App Got Exception
            );
            e.printStackTrace();
        }

        return resp;
    }


    }
