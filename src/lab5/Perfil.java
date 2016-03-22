package lab5;

public class Perfil {
	private String nome;
	private Musiteca musiteca;
	
	public Perfil(String nome) throws Exception{
		if(nome == null || nome.equals("")){
			throw new Exception("Nome do perfil nao pode ser nulo ou vazio");
		}
		this.setNome(nome);
		this.musiteca = new Musiteca();
		
		
	}
	
	
	public Musica obtemMusicaPorFaixa(String nomeAlbum, int faixa) throws Exception{
		return musiteca.obtemMusicaPorIndice(nomeAlbum, faixa);
	}
	
	public Album getAlbumPorNome(String nome) throws Exception{
		return musiteca.getAlbumPorNome(nome);
	}
	
	public boolean adicionaPlaylist(String nomePlaylist, String nomeAlbum, int faixa) throws Exception{
		return musiteca.adicionaPlaylist(nomePlaylist, nomeAlbum, faixa);
	}
	
	public Playlist getPlaylist(String nome) throws Exception{
		return musiteca.getPlaylist(nome);
	}
	
	public boolean removePlaylist(String nome) throws Exception{
		return musiteca.removePlaylist(nome);
	}
	
	public boolean adicionaFavorito(String nome){
		return musiteca.adicionaFavorito(nome);
	}
	
	public boolean removeFavorito(String nome){
		return musiteca.removeFavorito(nome);
	}
	
	public boolean pesquisaFavoritoPorNome(String nome){
		return musiteca.pesquisaFavoritoPorNome(nome);
	}
	
	public boolean pesquisaFavoritoPorObjeto(Album album){
		return musiteca.pesquisaFavoritoPorObjeto(album);
		
	}
	
	public boolean adicionaMusica(Musica musica) throws Exception{
		return musiteca.adicionaMusica(musica);
	}
	
	public boolean removeMusica(String nome){
		return musiteca.removeMusica(nome);
	}
	
	public int getDuracaoDoAlbum(String nome){
		return musiteca.getDuracaoAlbum(nome);
	}
	
	public int getDuracaoPlaylist(String nome) throws Exception{
		return musiteca.getDuracaoPlaylist(nome);
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
	
	
	
	
}
