package maratonajava.javacore.aula36_optional.test;

import maratonajava.javacore.aula36_optional.domain.Manga;
import maratonajava.javacore.aula36_optional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters").orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
