package com.dodo.app.product.controller;

import com.dodo.app.common.result.StdResult;
import com.dodo.app.product.dto.Product;
import com.dodo.app.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE }, consumes = {
            MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<StdResult<List<Product>>> getProducts() {
        return new ResponseEntity<>(new StdResult<>(productService.getProducts()), HttpStatus.OK);
    }


    @RequestMapping( value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<StdResult<String>> createProduct(@RequestBody Product product ){
        productService.addProduct(product);
        return new ResponseEntity<>(new StdResult<>("Product created successfully.)"), HttpStatus.OK);
    }

    @RequestMapping(value ="", method = RequestMethod.PUT ,consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<StdResult<String>> updateProduct( @RequestBody Product product) {
        productService.updateProduct(product);
        StdResult<String> result = new StdResult<>();
        result.setResponse("Product updated successfully.");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<StdResult<String>> remove(@PathVariable(required = true) Integer productId){
        productService.removeProduct(productId);
        StdResult result = new StdResult();
        result.setResponse("Product removed successfully");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "count", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<StdResult<Long>> getCount() {
         return new ResponseEntity<>(new StdResult<>(productService.getCount()), HttpStatus.OK);
    }
}
