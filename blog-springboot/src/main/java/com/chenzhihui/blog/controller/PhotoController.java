package com.chenzhihui.blog.controller;


import com.chenzhihui.blog.dto.PhotoDTO;
import com.chenzhihui.blog.service.PhotoService;
import com.chenzhihui.blog.vo.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 照片 前端控制器
 * </p>
 *
 * @author chenzhihui
 * @since 2022-10-19
 */
@RestController
//@RequestMapping("/photo")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    /**
     * 根据相册id查看照片列表
     *
     * @param albumId 相册id current 当前页
     * @return {@link Result<PhotoDTO>} 照片列表
     */
    @ApiOperation(value = "根据相册id查看照片列表")
    @GetMapping("/photo/listPhotosByAlbumId/{albumId}/{current}")
    public Result<PhotoDTO> listPhotosByAlbumId(@PathVariable("albumId") Integer albumId,@PathVariable("current") Long current) {
        return Result.ok(photoService.listPhotosByAlbumId(albumId,current));
    }
}

