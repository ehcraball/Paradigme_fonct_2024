/* DNAStrand ("ATTGC") -> "TAACG"
DNAStrand ("GTAT") -> "CATA" */

const str = { "A" : "T", "T" : "A", "C" : "G", "G" : "C",};

function complementaire (adn){
	return (adn.replaceAll(/T|C|A|G/g, remplace => str[remplace]));
}

console.log(complementaire("ATTGC"));
console.log(complementaire("GTAT"));