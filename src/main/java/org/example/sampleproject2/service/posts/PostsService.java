package org.example.sampleproject2.service.posts;


import lombok.RequiredArgsConstructor;
import org.example.sampleproject2.domain.posts.PostsRepository;
import org.example.sampleproject2.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto)
    {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
