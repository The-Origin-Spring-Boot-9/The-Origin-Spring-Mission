package com.doyeon.mission2.board;

import com.doyeon.mission2.post.PostDto;

import java.util.List;

public interface BoardRepository {

    boolean createBoard(BoardDto boardDto);

    boolean createPost(int boardId, PostDto postDto);

    List<BoardDto> findAllBoard();

    List<PostDto> findAllPost();

    BoardDto findBoardById(int id);

    PostDto findPostByID(int id);

    boolean updateBoard(int id, BoardDto boardDto);

    boolean updatePost(int id, PostDto postDto);

    boolean deleteBoard(int id);

    boolean deletePost(int id, String password);
}
