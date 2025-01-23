```groovy
def safeMethod(List<String> list) {
  if (list == null || list.isEmpty()) {
    return [] // or return null, as per need
  }

  def result = list.collect { it?.toUpperCase() ?: '' }
  return result
}

println safeMethod(null) // Output: []
println safeMethod([]) // Output: []
println safeMethod(['a', 'b', 'c']) // Output: [A, B, C]
println safeMethod(['a', null, 'c']) // Output: [A, '', C] // Nulls replaced with empty strings
```