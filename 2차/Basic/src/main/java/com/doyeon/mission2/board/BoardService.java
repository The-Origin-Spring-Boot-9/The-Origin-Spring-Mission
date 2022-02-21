package com.doyeon.mission2.board;

import com.doyeon.mission2.post.PostDto;

import java.util.List;

public interface BoardService {
    void createBoard(BoardDto boardDto);

    void createPost(int boardId, PostDto postDto);

    List<BoardDto> readBoardAll();

    List<PostDto> readPostAll();

    BoardDto readBoard(int id);

    PostDto readPost(int id);

    void updateBoard(int id, BoardDto boardDto);

    void updatePost(int id, PostDto postDto);

    void deleteBoard(int id);

    void deletePost(int id, String password);
}
